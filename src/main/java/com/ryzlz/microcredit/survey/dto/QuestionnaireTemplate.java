package com.ryzlz.microcredit.survey.dto;

import lombok.Data;

import java.util.List;

@Data
public class QuestionnaireTemplate {

    private String id;
    //主标题
    private String title;
    //描述
    private String direction;
    //问题列表
    private List<Question> questionList;
    //添加日期
    private String adddate;
    //修改时间
    private String operatedate;
    //是否启用
    private boolean isEnable;

}
