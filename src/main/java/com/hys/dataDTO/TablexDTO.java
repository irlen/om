package com.hys.dataDTO;

import lombok.Data;

@Data
public class TablexDTO {
    private String title;
    private String dataIndex;
    private String key;
    public TablexDTO(String title,String dataIndex,String key){
        this.title = title;
        this.dataIndex = dataIndex;
        this.key = key;
    }
}
