package core;

import bean.BaseSearchQuery;

/**
 * @author yagol
 * @TIME 2021/11/12 - 8:21 上午
 * @Description 网站数据爬虫
 **/
public interface PaperProcessor<SearchQuery extends BaseSearchQuery> {
    /**
     * 执行浏览器查询
     *
     * @param searchQuery 查询条件类，能够生成查询条件字符串
     */
    void run(SearchQuery searchQuery);
}