package com.springboot.share.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "merge")
public class MergeConfig {

    private List<NameDesc> list = new ArrayList<>();

    private Map<String, NameDesc> map = new HashMap<>();

    public List<NameDesc> getList() {
        return list;
    }

    public void setList(List<NameDesc> list) {
        this.list = list;
    }

    public Map<String, NameDesc> getMap() {
        return map;
    }

    public void setMap(Map<String, NameDesc> map) {
        this.map = map;
    }

    public static class NameDesc {
        private String name;
        private String desc;

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("name: ");
            sb.append(name);
            sb.append("</br>");
            sb.append("desc: ");
            sb.append(desc);
            sb.append("</br>");
            return sb.toString();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        this.list.forEach(sb::append);
        sb.append("</br></br>");
        this.map.forEach((key, value) -> {
            sb.append(key);
            sb.append("</br>");
            sb.append(value.toString());
        });
        return sb.toString();
    }
}
