package com.test.yxtest.util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * 代码生成
 *
 * @author shijialei
 * @date 2022/9/3
 */
public class CodeGenerator {

    public static void main(String[] args) {
        FastAutoGenerator
                .create("jdbc:mysql://47.105.89.232:3306/inter_view?allowMultiQueries=true&useUnicode=true" +
                        "&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai", "test0011", "TestPass1122!")
                .globalConfig(builder -> {
                    builder.author("Shijialei")
                            .enableSwagger()
                            .outputDir(System.getProperty("user.dir") + "/src/main/java");
                })
                .packageConfig(builder -> {
                    builder.parent("com.test")
                            .moduleName("yxtest")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, System.getProperty("user.dir") + "/src" +
                                    "/main/resources/templates/mapper"));
                })
                .strategyConfig(builder -> {
                    builder.addInclude("yx_sort");
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }

}
