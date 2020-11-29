package entity;

import java.util.List;

/**
 * 分页返回对象实体类
 *
 * @author: zhouwb
 * @data: 2020/11/29
 */
public class PageResult <T>{

    /**
     * 结果总数
     */
    private Long total;

    /**
     * 页记录数
     */
    private int pageSize;

    /**
     * 页码
     */
    private int pageNum;

    /**
     * 结果数组
     */
    private List<T> list;

    @Override
    public String toString() {
        return "PageResult{" +
                "total=" + total +
                ", pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                ", list=" + list +
                '}';
    }

    public PageResult(Long total, int pageSize, int pageNum, List<T> list) {
        this.total = total;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        this.list = list;
    }

    public PageResult() {
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
