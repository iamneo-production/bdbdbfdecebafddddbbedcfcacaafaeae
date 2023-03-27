package com.examly.springapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task_details")
public class Task {
  @Id
  // @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long workId;
  
  @Column(name = "workHolderName")
  private String workHolderName;
  
  @Column(name = "workDate")
  private String workDate;
  
  @Column(name = "workName")
  private String workName;
  
  @Column(name = "workStatus")
  private String workStatus;


  public Task(){

  }


  public Task(long workId, String workHolderName, String workDate, String workName, String workStatus) {
    this.workId = workId;
    this.workHolderName = workHolderName;
    this.workDate = workDate;
    this.workName = workName;
    this.workStatus = workStatus;
  }


  public long getTaskId() {
    return this.workId;
  }

  public void setTaskId(long workId) {
    this.workId = workId;
  }

  public String getTaskHolderName() {
    return this.workHolderName;
  }

  public void setTaskHolderName(String workHolderName) {
    this.workHolderName = workHolderName;
  }

  public String getTaskDate() {
    return this.workDate;
  }

  public void setTaskDate(String taskDate) {
    this.workDate = workDate;
  }

  public String getTaskName() {
    return this.workName;
  }

  public void setTaskName(String workName) {
    this.workName = workName;
  }

  public String getTaskStatus() {
    return this.workStatus;
  }

  public void setTaskStatus(String workStatus) {
    this.workStatus = workStatus;
  }
}
