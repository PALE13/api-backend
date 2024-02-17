package com.yupi.project.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 封装id请求
 * @author pale
 */
@Data
public class IdRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
