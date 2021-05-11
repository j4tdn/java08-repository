package persistence;

	public class ItemDto {

		public static final String IGR_ID = "igrId";
		public static final String IGR_NAME = "igrName";
		public static final String NOF_ITEMS = "nofItems";

		private Integer igrId;
		private String igrName;
		private Long nofItems;

		public ItemDto() {
		}

		public ItemDto(Integer igrId, String igrName, Long nofItems) {
			this.igrId = igrId;
			this.igrName = igrName;
			this.nofItems = nofItems;
		}

		public Integer getIgrId() {
			return igrId;
		}

		public void setIgrId(Integer igrId) {
			this.igrId = igrId;
		}

		public String getIgrName() {
			return igrName;
		}

		public void setIgrName(String igrName) {
			this.igrName = igrName;
		}

		public Long getNofItems() {
			return nofItems;
		}

		public void setNofItems(Long nofItems) {
			this.nofItems = nofItems;
		}

		@Override
		public String toString() {
			return "ItemDto [igrId=" + igrId + ", igrName=" + igrName + ", nofItems=" + nofItems + "]";
		}

	
}
