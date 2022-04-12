package com.course.education.model;

public class Item {
	 private Boolean canBePreviewed;
	    private String contentSummary;
	    private String description;
	    private Integer id;
	    private String iconClass;
	    private Boolean isCodingExercise;
	    private Boolean hasLinkedWorkspace;
	    private String landingPageUrl;
	    private Integer videoAssetId;
	    private String videoUrl;
	    private String learnUrl;
	    private String title;
	    private Integer objectIndex;
	    private String itemType;
		public Item(Boolean canBePreviewed, String contentSummary, String description, Integer id, String iconClass,
				Boolean isCodingExercise, Boolean hasLinkedWorkspace, String landingPageUrl, Integer videoAssetId,
				String videoUrl, String learnUrl, String title, Integer objectIndex, String itemType) {
			super();
			this.canBePreviewed = canBePreviewed;
			this.contentSummary = contentSummary;
			this.description = description;
			this.id = id;
			this.iconClass = iconClass;
			this.isCodingExercise = isCodingExercise;
			this.hasLinkedWorkspace = hasLinkedWorkspace;
			this.landingPageUrl = landingPageUrl;
			this.videoAssetId = videoAssetId;
			this.videoUrl = videoUrl;
			this.learnUrl = learnUrl;
			this.title = title;
			this.objectIndex = objectIndex;
			this.itemType = itemType;
		}
		public Item() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Boolean getCanBePreviewed() {
			return canBePreviewed;
		}
		public void setCanBePreviewed(Boolean canBePreviewed) {
			this.canBePreviewed = canBePreviewed;
		}
		public String getContentSummary() {
			return contentSummary;
		}
		public void setContentSummary(String contentSummary) {
			this.contentSummary = contentSummary;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getIconClass() {
			return iconClass;
		}
		public void setIconClass(String iconClass) {
			this.iconClass = iconClass;
		}
		public Boolean getIsCodingExercise() {
			return isCodingExercise;
		}
		public void setIsCodingExercise(Boolean isCodingExercise) {
			this.isCodingExercise = isCodingExercise;
		}
		public Boolean getHasLinkedWorkspace() {
			return hasLinkedWorkspace;
		}
		public void setHasLinkedWorkspace(Boolean hasLinkedWorkspace) {
			this.hasLinkedWorkspace = hasLinkedWorkspace;
		}
		public Object getLandingPageUrl() {
			return landingPageUrl;
		}
		public void setLandingPageUrl(String landingPageUrl) {
			this.landingPageUrl = landingPageUrl;
		}
		public Integer getVideoAssetId() {
			return videoAssetId;
		}
		public void setVideoAssetId(Integer videoAssetId) {
			this.videoAssetId = videoAssetId;
		}
		public String getVideoUrl() {
			return videoUrl;
		}
		public void setVideoUrl(String videoUrl) {
			this.videoUrl = videoUrl;
		}
		public String getLearnUrl() {
			return learnUrl;
		}
		public void setLearnUrl(String learnUrl) {
			this.learnUrl = learnUrl;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public Integer getObjectIndex() {
			return objectIndex;
		}
		public void setObjectIndex(Integer objectIndex) {
			this.objectIndex = objectIndex;
		}
		public String getItemType() {
			return itemType;
		}
		public void setItemType(String itemType) {
			this.itemType = itemType;
		}
		@Override
		public String toString() {
			return "Item [canBePreviewed=" + canBePreviewed + ", contentSummary=" + contentSummary + ", description="
					+ description + ", id=" + id + ", iconClass=" + iconClass + ", isCodingExercise=" + isCodingExercise
					+ ", hasLinkedWorkspace=" + hasLinkedWorkspace + ", landingPageUrl=" + landingPageUrl
					+ ", videoAssetId=" + videoAssetId + ", videoUrl=" + videoUrl + ", learnUrl=" + learnUrl
					+ ", title=" + title + ", objectIndex=" + objectIndex + ", itemType=" + itemType + "]";
		}
	    
}
