

public class Snippet {
	@DeleteMapping(value = "/delete")
		public ResponseEntity<Boolean> f5(@RequestBody Visitor visitor) {
			VisitorDeleteResponse response = new VisitorDeleteResponse();
			try {
				this.service.deleteVisitor(visitor);
				response.setStatusCode(200);
				response.setDescription("Visitor Deleted Successfully");
				response.setDeleteStatus(true);
				
			} catch (Exception e) {
				response.setStatusCode(200);
				response.setDescription("Visitor Not Deleted");
				response.setDeleteStatus(false);
			}
			return ResponseEntity.internalServerError().body(response);
		}
}