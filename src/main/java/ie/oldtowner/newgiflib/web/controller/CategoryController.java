package ie.oldtowner.newgiflib.web.controller;

import ie.oldtowner.newgiflib.model.Category;
import ie.oldtowner.newgiflib.service.CategoryService;
import ie.oldtowner.newgiflib.web.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by walshejo on 02/02/2017.
 */
@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @SuppressWarnings("unchecked")
    @RequestMapping("/categories")
    public String listCategories(Model model){
        // TODO: Get all categories
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories",categories);
        return "category/index";
    }

    @RequestMapping(value = "/categories/add")
    public String formNewCategory(Model model){
        model.addAttribute("category",new Category());

        model.addAttribute("colors", Color.values());

        return "category/form";
    }

    @RequestMapping(value = "/categories/{categoryId}/edit", method = RequestMethod.POST)
    public String formEditCatgory(@PathVariable Long categoryId,Model model){
        return "category/form";
    }

    @RequestMapping(value = "/categories/{categoryId}", method = RequestMethod.POST)
    public String updateCategories(){
        return null;
    }

    @RequestMapping(value = "/categories", method = RequestMethod.POST)
    public String addCategory(Category category){
        //TODO JW - Add category if valid data was recieved
        categoryService.save(category);
        //TODO JW - Redirect to /categories
        return "redirect:/categories"; //POST request, REDIRECT in return, new GET request with specified UR
    }

    @RequestMapping(value = "/categories/{categoryId}/delete", method=RequestMethod.POST)
    public String deleteCategory(@PathVariable Long categoryId){
        //TODO JW - Delete category if it contains no gifs

        //TODO JW - Redirect to /categories
        return null;
    }
}

