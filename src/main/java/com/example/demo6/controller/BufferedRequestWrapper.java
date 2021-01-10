package com.example.demo6.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.*;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Slf4j
public class BufferedRequestWrapper extends HttpServletRequestWrapper {
	ByteArrayInputStream bais;

    BufferedServletInputStream bsis;

    byte[] buffer;

    public BufferedRequestWrapper(HttpServletRequest req, int length) throws IOException {
        super(req);
        InputStream is = req.getInputStream();
        buffer = new byte[length];
        try {
            buffer = IOUtils.toByteArray(is);

        }catch (IOException e){
            log.error(e.getMessage());
        }

    }

    @Override
    public BufferedReader getReader() throws IOException {
        return new BufferedReader(new InputStreamReader(super.getInputStream()));
    }

    @Override
    public ServletInputStream getInputStream() {
        try {
            bais = new ByteArrayInputStream(buffer);
            bsis = new BufferedServletInputStream(bais);
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        } finally {
        }
        return bsis;
    }

    @Override
    public String getParameter(String name) {
        bais = new ByteArrayInputStream(buffer);
        String str=getRequestBody(bais);
//        System.out.println("22222222222222222222222"+str);
//        String dd = "id=123&state=4&acceptName=11&remark=22";
        String[] splitAddres = str.split("&");
        Map<String,Object> map= new HashMap<String,Object>();
        for (String ss :splitAddres){

            map.put(ss.substring(0, ss.indexOf("=")),ss.substring(ss.indexOf("=")+1));
        }


        //过滤特殊字符
        String regex = "(script)|(document)|(eval)|(CR)|(LF)|[|&;$%@'\"\"<>()+,.]";
        return String.valueOf(map.get(name)).replaceAll(regex,"");
    }

    private String getRequestBody(InputStream stream) {
        String line = "";
        StringBuilder body = new StringBuilder();
        int counter = 0;

        // 读取POST提交的数据内容
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream, Charset.forName("UTF-8")));
        try {
            while ((line = reader.readLine()) != null) {
                body.append(line);
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return body.toString();
    }

    public static void main(String[] args) {


       String  c="{\"c11\":\"\",\"c10\":\"无受潮、无结块\",\"c13\":\"\",\"c12\":\"\",\"c15\":[\"比表面积\",\"凝结时间\",\"安定性\",\"胶砂抗折强度\",\"胶砂抗压强度\",\"烧失量\",\"三氧化硫含量\",\"氧化镁含量\",\"氯离子含量\",\"游离氧化钙含量\",\"碱含量\"]}";
//        Map<String, String> map = JSONObject.parseObject(c, Map.class);
        String  cc="{\"c11\":\"\",\"c10\":\" 您好，您反馈的问题非我部受理渠道，我侧仅负责受理中国电信网上营业厅、电信营业厅app、微信公众号：中国电信营业厅、微信小程序：中国电信营业厅”渠道上的不良信息举报，关于您的问题建议联系国家官方举报渠道，谢谢。\"}";
        Map<Object,Object> mapType = JSON.parseObject(cc,Map.class);
        System.out.println(mapType.toString());
    }
}
