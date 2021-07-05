package mapper;

import java.util.List;

@Mapper

interface TestMapper {


    @Select("""
            select * from post
            """)
    List<Test> getPost();

    @Insert("""
            INSERT into
            post(user_id, board_id, content, board_type, reg_date, hits_count)
            values(#{test.userId},
                   #{test.boardId},
                   #{test.content},
                   #{test.boardType},
                   sysdate(),
                   #{test.hitsCount});
            """)
    int insertPost(@Param("test") Test test)

    @Insert("""
            INSERT into likes (user_id, post_id, flag)
            values(#{test.userId},
                   #{test.postId},
                   #{test.flag});
            """)
    int insertLikes(@Param("test") Test likes)

    @Update("""
            UPDATE post , likes
            set hits_count = hits_count + flag
            WHERE post.id = likes.post_id;
            """)
    int updateHitsCount(@Param("test") Test hitcn)

}
