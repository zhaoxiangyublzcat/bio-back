package cn.blz.controller;

import cn.blz.service.SearchProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * bio_product_spu 商品表(spu)(BioProductSpu)表控制层
 *
 * @author blz
 * @since 2019-02-25 20:21:19
 */
@RestController
@RequestMapping("searchProduct")
public class SearchProductController {
    /**
     * 服务对象
     */
    @Resource
    private SearchProductService searchProductService;

    @GetMapping("elSearch/{title}")
    public void getByTitleOrContentLike(@PathVariable("title") String title) {
        System.out.println(this.searchProductService.getByTitleOrContentLike(title));
    }


}
