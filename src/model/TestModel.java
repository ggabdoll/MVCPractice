package model;

import

import java.util.Date;
import java.util.List; ...

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TestModel {

    private Integer id;
    private Integer postId;
    private String userId;
    private Integer boardId;
    private String content;
    private String boardType;
    private Date regDate;
    private Date updateDate;
    private String image1;
    private String image2;
    private String image3;
    private String image4;
    private String image5;
    private String hitsCount;
    private List<Comment> comments;
    private String flag;
}
