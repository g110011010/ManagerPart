package com.sf.recommended;

/**
 * Created by sf on 2017/8/18.
 * 调用系统中的各个推荐算法并整理出最终的推荐结果
 */
public class ResultCF {
//    推荐系统所应该推荐的课程的最大数量
    public final static int COURSE_NUM=20;
//    被推荐对象的id,在执行推荐算法前，该变量必须首先被定义
    private int user_id;
//    当前用户基于课程推荐的权值
    private double itemCF_Power;
//    当前用户基于用户推荐的权值
    private double userCF_Power;
//    当前用户基于新课程推荐的权值
    private double newCourseCF_power;
/*
* @return 被推荐对象的Id*/
    public int getUser_id() {
        return user_id;
    }


}
