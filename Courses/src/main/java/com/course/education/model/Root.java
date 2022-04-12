package com.course.education.model;

import java.util.ArrayList;
import java.util.List;

public class Root {

		private List<Section> sections = new ArrayList<Section>();
	    private String estimatedContentLengthText;
	    private Integer estimatedContentLengthInSeconds;
	    private Integer numOfPublishedVideos;
		public Root(List<Section> sections, String estimatedContentLengthText, Integer estimatedContentLengthInSeconds,
				Integer numOfPublishedVideos) {
			super();
			this.sections = sections;
			this.estimatedContentLengthText = estimatedContentLengthText;
			this.estimatedContentLengthInSeconds = estimatedContentLengthInSeconds;
			this.numOfPublishedVideos = numOfPublishedVideos;
		}
		public Root() {
			super();
			// TODO Auto-generated constructor stub
		}
		public List<Section> getSections() {
			return sections;
		}
		public void setSections(List<Section> sections) {
			this.sections = sections;
		}
		public String getEstimatedContentLengthText() {
			return estimatedContentLengthText;
		}
		public void setEstimatedContentLengthText(String estimatedContentLengthText) {
			this.estimatedContentLengthText = estimatedContentLengthText;
		}
		public Integer getEstimatedContentLengthInSeconds() {
			return estimatedContentLengthInSeconds;
		}
		public void setEstimatedContentLengthInSeconds(Integer estimatedContentLengthInSeconds) {
			this.estimatedContentLengthInSeconds = estimatedContentLengthInSeconds;
		}
		public Integer getNumOfPublishedVideos() {
			return numOfPublishedVideos;
		}
		public void setNumOfPublishedVideos(Integer numOfPublishedVideos) {
			this.numOfPublishedVideos = numOfPublishedVideos;
		}
		@Override
		public String toString() {
			return "Root [estimatedContentLengthText=" + estimatedContentLengthText
					+ ", estimatedContentLengthInSeconds=" + estimatedContentLengthInSeconds + ", numOfPublishedVideos="
					+ numOfPublishedVideos + "]";
		}
	    
}
