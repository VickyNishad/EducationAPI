package com.course.education.model;

import java.util.ArrayList;
import java.util.List;

public class Section {
		private String contentLengthText;
	    private Integer contentLength;
	    private Integer index;
	    private List<Item> items = new ArrayList<Item>();
	    private Integer videoCount;
	    private String title;
		public Section(String contentLengthText, Integer contentLength, Integer index, List<Item> items,
				Integer videoCount, String title) {
			super();
			this.contentLengthText = contentLengthText;
			this.contentLength = contentLength;
			this.index = index;
			this.items = items;
			this.videoCount = videoCount;
			this.title = title;
		}
		public Section() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getContentLengthText() {
			return contentLengthText;
		}
		public void setContentLengthText(String contentLengthText) {
			this.contentLengthText = contentLengthText;
		}
		public Integer getContentLength() {
			return contentLength;
		}
		public void setContentLength(Integer contentLength) {
			this.contentLength = contentLength;
		}
		public Integer getIndex() {
			return index;
		}
		public void setIndex(Integer index) {
			this.index = index;
		}
		public List<Item> getItems() {
			return items;
		}
		public void setItems(List<Item> items) {
			this.items = items;
		}
		public Integer getVideoCount() {
			return videoCount;
		}
		public void setVideoCount(Integer videoCount) {
			this.videoCount = videoCount;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		@Override
		public String toString() {
			return "Section [contentLengthText=" + contentLengthText + ", contentLength=" + contentLength + ", index="
					+ index + ", videoCount=" + videoCount + ", title=" + title + "]";
		}

}
