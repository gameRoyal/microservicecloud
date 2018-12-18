package entity;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_content", schema = "pyg", catalog = "")
public class TbContent {
    private long id;
    private long categoryId;
    private String title;
    private String url;
    private String pic;
    private String status;
    private Integer sortOrder;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "category_id", nullable = false)
    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "title", nullable = true, length = 200)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "url", nullable = true, length = 500)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "pic", nullable = true, length = 300)
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "status", nullable = true, length = 1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "sort_order", nullable = true)
    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbContent tbContent = (TbContent) o;

        if (id != tbContent.id) return false;
        if (categoryId != tbContent.categoryId) return false;
        if (title != null ? !title.equals(tbContent.title) : tbContent.title != null) return false;
        if (url != null ? !url.equals(tbContent.url) : tbContent.url != null) return false;
        if (pic != null ? !pic.equals(tbContent.pic) : tbContent.pic != null) return false;
        if (status != null ? !status.equals(tbContent.status) : tbContent.status != null) return false;
        if (sortOrder != null ? !sortOrder.equals(tbContent.sortOrder) : tbContent.sortOrder != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (categoryId ^ (categoryId >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (sortOrder != null ? sortOrder.hashCode() : 0);
        return result;
    }
}
