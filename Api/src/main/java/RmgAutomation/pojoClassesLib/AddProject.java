package RmgAutomation.pojoClassesLib;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
public class AddProject {

	@JsonPropertyOrder(
			value = {
					 "projectName",
					 "projectId",
					 "createdBy",
					 "createdOn",
					 "teamSize",
					 "status"
			        }
			)
	public class AddProjectPojoClass {

		String projectId;
		String projectName;
		String createdBy;
		String createdOn;
		String status;
		String msg;
		int teamSize;
//		public AddProjectPojoClass(String projectId, String projectName, String createdBy, String createdOn, String status,
//				int teamSize) {
//			super();
//			this.projectId = projectId;
//			this.projectName = projectName;
//			this.createdBy = createdBy;
//			this.createdOn = createdOn;
//			this.status = status;
//			this.teamSize = teamSize;
//		}
		/*******Default Constructor*******/
		AddProjectPojoClass() {}
		public String getProjectId() {
			return projectId;
		}
		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public String getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}
		public String getCreatedOn() {
			return createdOn;
		}
		public void setCreatedOn(String createdOn) {
			this.createdOn = createdOn;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public int getTeamSize() {
			return teamSize;
		}
		public void setTeamSize(int teamSize) {
			this.teamSize = teamSize;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		

	}


}
