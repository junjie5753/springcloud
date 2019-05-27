package com.junjie.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
@Data
public class Dept implements Serializable {
   private Long deptNo;
   private String deptName;
   private String dbSource;
}
