package com.guison.community.community.cache;

import com.guison.community.community.dto.TagDTO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TagCache {
    public static List<TagDTO> get(){
        List<TagDTO> tagDTOS = new ArrayList<>();
        TagDTO program = new TagDTO();
        program.setTags(Arrays.asList("javascript","php","css","html ","html5 ","java","node.js ","python","c++ ","c","golang","objective-c","typescript","shell","c# ","swift","sass ","bash ","ruby","less","asp.net","lua ","scala ","coffeescript","actionscript","rust","erlang ","perl"));
        program.setCategoryName("编程语言");
        tagDTOS.add(program);

        TagDTO framework = new TagDTO();
        framework.setTags(Arrays.asList("laravel","spring ","express","django","flask","yii","ruby-on-rails","tornado ","koa","struts"));
        framework.setCategoryName("平台框架");
        tagDTOS.add(framework);

        TagDTO server = new TagDTO();
        server.setTags(Arrays.asList("linux","nginx","docker","apache","ubuntu","centos","缓存","tomcat","负载均衡","unix","hadoop","windows-server"));
        server.setCategoryName("服务器");
        tagDTOS.add(server);

        TagDTO db = new TagDTO();
        db.setTags(Arrays.asList("mysql","redis","mongodb","sql","oracle","nosql","memcached","sqlserver","postgresql","sqlite"));
        db.setCategoryName("数据库");
        tagDTOS.add(db);

        TagDTO tool = new TagDTO();
        tool.setTags(Arrays.asList("git","github","visual-studio-code","vim","sublime-text","xcode","intellij-idea","eclipse","maven","ide","svn","visual-studio","atom","emacs","textmate","hg"));
        tool.setCategoryName("开发工具");
        tagDTOS.add(tool);

        return tagDTOS;
    }

    public static String filterInvalid(String tags){
        String[] split = StringUtils.split(tags, ",");
        List<TagDTO> tagDTOS = get();
        List<String> tagList = tagDTOS.stream().flatMap(tag -> tag.getTags().stream()).collect(Collectors.toList());
        String invalid = Arrays.stream(split).filter(t -> !tagList.contains(t)).collect(Collectors.joining(","));
        return invalid;
    }
}

