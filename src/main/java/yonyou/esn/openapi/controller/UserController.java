package yonyou.esn.openapi.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import yonyou.esn.openapi.common.HttpClientUtil;

@RequestMapping("/")
@Controller
public class UserController {

    private static Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Value("${ec.user.url}")
    private String userHostUrl;

    @GetMapping("/index")
    public String getNcUserInfo(@RequestParam String code, Model model){
        String userId = getUserId(code);
        if(StringUtils.isEmpty(userId)){
            userId = "NO_USER_ID";
        }
        model.addAttribute("userid", userId);
        return "index";
    }

    private String getUserId(String code) {
        try{
            String url = userHostUrl + code;
            String jsonData = HttpClientUtil.get(url, null);
            return JSONObject.parseObject(jsonData).getJSONObject("data").getString("accountCode");
        } catch (Exception e){
            LOGGER.error("getNcUserInfo error:{}", e);
            return null;
        }
    }
}
