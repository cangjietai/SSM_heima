package com.lisitao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: Solitude
 * @Data: 2021/11/15 09:16
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double money;
}
