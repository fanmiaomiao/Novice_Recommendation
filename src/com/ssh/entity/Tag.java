package com.ssh.entity;

import java.util.HashSet;
import java.util.Set;

public class Tag {

	private Integer tagId;
	private String tagName;
	//一个标签对应多个联系
	private Set<Mer_tag> setTagMer = new HashSet<Mer_tag>();
	
	public Set<Mer_tag> getSetTagMer() {
		return setTagMer;
	}
	public void setSetTagMer(Set<Mer_tag> setTagMer) {
		this.setTagMer = setTagMer;
	}
	public Integer getTagId() {
		return tagId;
	}
	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	
}
