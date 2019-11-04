package com.guison.community.community.dto;

import com.guison.community.community.model.Question;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page ;
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setPagination(Integer totalPage, Integer page) {
        this.totalPage = totalPage;
        this.page = page;

        pages.add(page);
        for(int i = 1;i<= 3;i++){
            if(page - i>0){
                pages.add(0,page - i);
            }
            if(page + i<= totalPage){
                pages.add(page + i);
            }
        }

        //是否显示上一页
        if (page == 1){
            showPrevious = false;
        }else {
            showPrevious = true;
        }

        //是否显示下一页
        if (page == totalPage){
            showNext = false;
        }else {
            showNext = true;
        }

        //是否显示第一页
        if (pages.contains(1)){
            showFirstPage = false;
        }else {
            showFirstPage = true;
        }

        //是否显示第一页
        if (pages.contains(totalPage)){
            showEndPage = false;
        }else {
            showEndPage = true;
        }

    }
}
