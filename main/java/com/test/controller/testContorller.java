package com.test.controller;

import com.test.pojo.Combo;
import com.test.pojo.Torder;
import com.test.service.OrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.UUID;

/**
 * @author lg
 * @version 1.0
 * @since 1.8
 */
@Controller
@RequestMapping("/order")
public class testContorller {
    @Autowired
    OrderService orderService;
    @PostMapping("list")
    @GetMapping("list")
    @RequestMapping(value={"/list.action","/lll.action"},
    method={RequestMethod.POST,RequestMethod.GET})
    public ModelAndView showlist(){
        ModelAndView a=new ModelAndView();
        a.addObject("list",orderService.getList());
        a.setViewName("show");
        return a;
    }

    @RequestMapping(value = {"/eidt.action","ppp","ooo"})
    public String edit(@RequestParam(value = "id",required =true,defaultValue = "1")Integer iid, Model model){
        Torder orderById = orderService.getOrderById(iid);
        model.addAttribute("torder",orderById);
        return "forward:/edit.jsp";
    }

    @RequestMapping("delete.action")
    public String deleteOrder(Combo combo,int[] ids){
       combo.getOrderList();
       return "";
    }
    @RequestMapping("/updateOrder.action")
    public String updateProduts(Combo combo,MultipartFile picFile) throws IOException {
//        //处理上传的文件
//        判断文件是否存在
      if (!picFile.isEmpty()){
            String originalFileName=picFile.getOriginalFilename();
//            获取扩展名
            String txt=originalFileName.substring(originalFileName.lastIndexOf("."));
            String newFileName= UUID.randomUUID()+txt;
//            把文件保存到images目录下

           URL url= this.getClass().getClassLoader().getResource(".");
            String classpath = url.getPath();
            //获取文件名
            System.out.println(classpath);
            File imagesPath=new File(classpath+"../../images/"+newFileName);
            System.out.println(imagesPath.getPath()+"  2");
              picFile.transferTo(imagesPath);
            combo.getTorder().setPic(newFileName);
        }
      Torder torder=combo.getTorder();
        orderService.updateOrder(torder);
        return"redirect:/order/list.action";
    }

}
