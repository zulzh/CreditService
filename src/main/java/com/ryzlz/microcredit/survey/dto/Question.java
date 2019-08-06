package com.ryzlz.microcredit.survey.dto;

import java.util.List;

public class Question {

    //标题
    private String title;
    //描述
    private String direction;
    //问题类型
    private String type;
    //选项列表
    private List<Options> optionsList;
    //文本问题
    private String textQuestion;
    //文本答案
    private String textAnwser;

}
