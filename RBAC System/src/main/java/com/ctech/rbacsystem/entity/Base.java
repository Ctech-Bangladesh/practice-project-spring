package com.ctech.rbacsystem.entity;

import java.util.Date;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public abstract class Base {

  private long bid;
  private boolean bStatus;
  protected Date createdAt;
  protected Date updatedAt;
  private CreatedBy createdBy;
  private LastModifiedBy lastModifiedBy;

}
