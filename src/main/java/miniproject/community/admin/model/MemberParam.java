package miniproject.community.admin.model;

import lombok.Data;

@Data
public class MemberParam {

    long pageIndex;
    long pageSize;

    String searchType;
    String searchValue;

    /*  --> 구현하고 싶은 페이징
    limit 0, 10  --> page Index: 1
    limit 10, 10 --> page Index: 2
    limit 20, 10 --> page Index: 3
    limit 30, 10 --> page Index: 4
     */


    public long getPageStart() {
        init();

        return (pageIndex - 1) * pageSize;
    }

    public long getPageEnd() {
        init();
        return pageSize;
    }

    public void init() {
        if (pageIndex < 1) {
            pageIndex = 1;
        }

        if (pageSize < 10) {
            pageSize = 10;
        }
    }

    public String getQueryString() {
        init();

        StringBuilder sb = new StringBuilder();

        if (searchType != null && searchType.length() > 0) {
            sb.append(String.format("searchType=%s", searchType));
        }

        if (searchValue != null && searchValue.length() > 0) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(String.format("searchValue=%s", searchValue));
        }

        return sb.toString();
    }
}
