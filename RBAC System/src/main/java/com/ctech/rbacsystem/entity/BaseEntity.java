package com.ctech.rbacsystem.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.*;

@Getter
@Setter
public class BaseEntity {
    private CreatedDate createdDate;
    private CreatedBy createdBy;
    private LastModifiedDate updatedDate;
    private LastModifiedBy updatedBy;
}
