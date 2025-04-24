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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.dto.request.VisitorAddRequest;
import com.training.dto.request.VisitorDeleteRequest;
import com.training.dto.request.VisitorModifyRequest;
import com.training.dto.response.VisitorAddResponse;
import com.training.dto.response.VisitorDeleteResponse;
import com.training.dto.response.VisitorModifyResponse;
import com.training.dto.response.VisitorSearchResponse;
import com.training.dto.response.VisitorShowAllByNameResponse;
import com.training.dto.response.VisitorShowAllResponse;
import com.training.dto.response.VisitorsShowAllByCityResponse;
import com.training.exception.VisitorNotFoundException;
import com.training.model.Visitor;
import com.training.service.VisitorService;

@RestController
@RequestMapping(value = "/api")
public class VisitorController {

	@Autowired
	VisitorService service;

//	@PostMapping(value = "/add")
//	public ResponseEntity<VisitorAddResponse> f1(@RequestBody Visitor visitor) {
//		Visitor visitor1 = this.service.addNewVisitor(visitor);
//		VisitorAddResponse response = new VisitorAddResponse();
//		response.setStatusCode(200);
//		response.setDescription("Visitor Added Successfully");
//		response.setVisitor(visitor1);
//
//		return new ResponseEntity<>(response, HttpStatus.CREATED);
//	}

	@PostMapping(value = "/add")
	public ResponseEntity<VisitorAddResponse> f1(@RequestBody VisitorAddRequest request) {
		Visitor visitor1 = this.service.addNewVisitor(request.getVisitor());
		VisitorAddResponse response = new VisitorAddResponse();
		response.setStatusCode(200);
		response.setDescription("Visitor Added Successfully");
		response.setVisitor(visitor1);

		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	@GetMapping(value = "/showAll", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<VisitorShowAllResponse> f4() {

		List<Visitor> visitors = this.service.getAllVisitors();
		VisitorShowAllResponse response = new VisitorShowAllResponse();
		response.setStatusCode(200);
		response.setDescription("All Visitors Fetched");
		response.setVisitors(visitors);
		return ResponseEntity.ok(response);

	}

	//// Updation using response object
//	@PutMapping(value = "/modify")
//	public ResponseEntity<VisitorModifyResponse> f2(@RequestBody Visitor visitor) {
//
//		VisitorModifyResponse response = new VisitorModifyResponse();
//
//		Visitor visitor1 = this.service.searchVisitor(visitor);
//
//		if (visitor1 != null) {
//
//			Visitor visitor2 = this.service.updateVisitor(visitor);
//			response.setStatusCode(200);
//			response.setDescription("Visitor modified Successfully");
//			response.setVisitor(visitor2);
//			return ResponseEntity.ok(response);
//
//		} else {
//			response.setStatusCode(404);
//			response.setDescription("Visitor Not Found for Modification");
//			response.setVisitor(null);
//			return new ResponseEntity<VisitorModifyResponse>(response, HttpStatus.NOT_FOUND);
//		}
//
//	}

	// Updation using request object
	@PutMapping(value = "/modify")
	public ResponseEntity<VisitorModifyResponse> f2(@RequestBody VisitorModifyRequest request) {

		VisitorModifyResponse response = new VisitorModifyResponse();

		Visitor visitor1 = this.service.searchVisitor(request.getVisitor());

		if (visitor1 != null) {

			Visitor visitor2 = this.service.updateVisitor(request.getVisitor());
			response.setStatusCode(200);
			response.setDescription("Visitor modified Successfully");
			response.setVisitor(visitor2);
			return ResponseEntity.ok(response);

		} else {
			response.setStatusCode(404);
			response.setDescription("Visitor Not Found for Modification");
			response.setVisitor(null);
			return new ResponseEntity<VisitorModifyResponse>(response, HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping(value = "/findById/{vid}")
	public ResponseEntity<VisitorSearchResponse> f3(@PathVariable(name = "vid") int vid) throws Exception {

		VisitorSearchResponse response = new VisitorSearchResponse();
		Visitor visitor1 = this.service.searchVisitor(vid);

		if (visitor1 != null) {
			response.setStatusCode(200);
			response.setDescription("Visitor fetched successfully");
			response.setVisitor(visitor1);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else {

			Exception exception = new VisitorNotFoundException("Visitor Not Found");
			throw exception;
		}
		/*
		 * else { response.setStatusCode(404);
		 * response.setDescription("Visitor Not Found"); response.setVisitor(null);
		 * return new ResponseEntity<>(response, HttpStatus.NOT_FOUND); }
		 */

	}

	@GetMapping(value = "/find")
	public Visitor f6(@RequestBody Visitor visitor) {

		return this.service.searchVisitor(visitor);
	}

//delete using Response object
//	@DeleteMapping(value = "/delete")
//	public ResponseEntity<VisitorDeleteResponse> f5(@RequestBody Visitor visitor) {
//		VisitorDeleteResponse response = new VisitorDeleteResponse();
//		Visitor visitor1 = this.service.searchVisitor(visitor);
//		if (visitor1 != null) {
//			try {
//				this.service.deleteVisitor(visitor);
//				response.setStatusCode(200);
//				response.setDescription("Visitor Deleted Successfully");
//				response.setDeleteStatus(true);
//				return ResponseEntity.ok().body(response);
//
//			} catch (Exception e) {
//				response.setStatusCode(500);
//				response.setDescription("Visitor Not Deleted");
//				response.setDeleteStatus(false);
//				return ResponseEntity.internalServerError().body(response);
//			}
//		} else {
//			response.setStatusCode(404);
//			response.setDescription("Visitor Not found");
//			response.setDeleteStatus(false);
//			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
//		}
//
//	}

	// delete using Response request
	@DeleteMapping(value = "/delete")
	public ResponseEntity<VisitorDeleteResponse> f5(@RequestBody VisitorDeleteRequest request) {
		VisitorDeleteResponse response = new VisitorDeleteResponse();
		Visitor visitor1 = this.service.searchVisitor(request.getVisitor());
		if (visitor1 != null) {
			try {
				this.service.deleteVisitor(request.getVisitor());
				response.setStatusCode(200);
				response.setDescription("Visitor Deleted Successfully");
				response.setDeleteStatus(true);
				return ResponseEntity.ok().body(response);

			} catch (Exception e) {
				response.setStatusCode(500);
				response.setDescription("Visitor Not Deleted");
				response.setDeleteStatus(false);
				return ResponseEntity.internalServerError().body(response);
			}
		} else {
			response.setStatusCode(404);
			response.setDescription("Visitor Not found");
			response.setDeleteStatus(false);
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping(value = "/showAllByName/{name}", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<VisitorShowAllByNameResponse> f6(@PathVariable(name = "name") String name) {
		VisitorShowAllByNameResponse response = new VisitorShowAllByNameResponse();
		List<Visitor> visitorsBySameName = this.service.getAllVisitorsBySameName(name);
		if (visitorsBySameName.isEmpty()) {
			response.setStatusCode(200);
			response.setDescription("There is no visitors by same name" + name);
			response.setVisitors(visitorsBySameName);
		} else {
			response.setStatusCode(200);
			response.setDescription("There are " + visitorsBySameName.size() + "with same name");
			response.setVisitors(visitorsBySameName);
		}

		return ResponseEntity.ok(response);

	}

	@GetMapping(value = "/showAllByCity/{comingfrom}", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<VisitorsShowAllByCityResponse> f7(@PathVariable(name = "comingfrom") String city) {
		VisitorsShowAllByCityResponse response = new VisitorsShowAllByCityResponse();
		List<Visitor> visitorsByCity = this.service.getAllVisitorsByCity(city);
		if (visitorsByCity.isEmpty()) {
			response.setStatusCode(200);
			response.setDescription("There is no visitors by city name " + city);
			response.setVisitors(visitorsByCity);
		} else {
			response.setStatusCode(200);
			response.setDescription("There are " + visitorsByCity.size() + " cities with  name");
			response.setVisitors(visitorsByCity);
		}

		return ResponseEntity.ok(response);

	}

}
