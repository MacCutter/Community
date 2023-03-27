package miniproject.community.admin.mapper;


import miniproject.community.admin.dto.MemberDto;
import miniproject.community.admin.model.MemberParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    long selectListCount(MemberParam parameter);
    List<MemberDto> selectList(MemberParam parameter);
}
