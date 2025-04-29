package com.training.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Stock;
import com.training.service.StockService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/stocks")
public class StockController {

	@Autowired
	StockService service;

	@PostMapping("/add")
	
	public ResponseEntity<Stock> f1(@RequestBody @Valid Stock request) {
		Stock stock = this.service.addNewStock(request);
		
		return new ResponseEntity<>(request, HttpStatus.CREATED);
	}

	@GetMapping("/showAll")
	
	public ResponseEntity<StockShowAllResponse> f2() {
		StockShowAllResponse response = new StockShowAllResponse();
		List<Supplier> suppliers = this.service.getAllSuppliers();

		if (suppliers.isEmpty()) {
			response.setStatusCode(200);
			response.setDescription("There is no suppliers in DB");
			response.setSupplier(null);
		} else {
			response.setStatusCode(200);
			response.setDescription("All Suppliers Fetched");
			response.setSupplier(suppliers);
		}
		return ResponseEntity.ok(response);

	}

	@PutMapping(value = "/modify")
	public ResponseEntity<StockModifyResponse> f3(@RequestBody StockModifyRequest request) {

		StockModifyResponse response = new StockModifyResponse();

		Supplier supplier = this.service.searchSupplier(request.getSupplier());

		if (supplier != null) {

			Supplier supplier1 = this.service.updateSupplier(request.getSupplier());
			response.setStatusCode(200);
			response.setDescription("Supplier modified Successfully");
			response.setSupplier(supplier1);
			return ResponseEntity.ok(response);

		} else {
			response.setStatusCode(404);
			response.setDescription("Supplier Not Found for Modification");
			response.setSupplier(supplier);
			return new ResponseEntity<StockModifyResponse>(response, HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping(value = "/findById/{sid}")
	public ResponseEntity<StockSearchResponse> f4(@PathVariable(name = "sid") int supId) throws Exception {

		StockSearchResponse response = new StockSearchResponse();
		Supplier supplier = this.service.searchSuppliers(supId);

		if (supplier != null) {
			response.setStatusCode(200);
			response.setDescription("Supplier fetched successfully");
			response.setSupplier(supplier);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else {

			Exception exception = new StockNotFoundException("Supplier Not Found");
			throw exception;
		}

	}

	@DeleteMapping(value = "/delete")
	public ResponseEntity<StockDeleteResponse> f6(@RequestBody StockDeleteRequest request) {
		StockDeleteResponse response = new StockDeleteResponse();
		Supplier supplier = this.service.searchSupplier(request.getSupplier());
		if (supplier != null) {
			try {
				this.service.deleteSupplier(supplier);
				response.setStatusCode(200);
				response.setDescription("Supplier Deleted Successfully");
				response.setDeleteStatus(true);
				return ResponseEntity.ok().body(response);

			} catch (Exception e) {
				response.setStatusCode(500);
				response.setDescription("Supplier Not Deleted");
				response.setDeleteStatus(false);
				return ResponseEntity.internalServerError().body(response);
			}
		} else {
			response.setStatusCode(404);
			response.setDescription("Supplier Not found");
			response.setDeleteStatus(false);
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		}

	}

}
