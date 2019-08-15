package com.ryzlz.microcredit.survey.dto;

import lombok.Data;

import java.util.List;

@Data
public class Questionnaire {

    private String _id;
    //用户ID
    private Integer userid;

    //问卷模板
    private QuestionnaireTemplate questionnaireTemplate;

    //添加日期
    private String adddate;

    private String operatedate;


}
