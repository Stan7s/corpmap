package edu.scu.corpmap.dao;

import edu.scu.corpmap.entity.mysql.HotCorp;
import edu.scu.corpmap.entity.mysql.HotCorpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotCorpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_corp
     *
     * @mbg.generated Wed Jun 20 20:03:33 CST 2018
     */
    long countByExample(HotCorpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_corp
     *
     * @mbg.generated Wed Jun 20 20:03:33 CST 2018
     */
    int deleteByExample(HotCorpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_corp
     *
     * @mbg.generated Wed Jun 20 20:03:33 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_corp
     *
     * @mbg.generated Wed Jun 20 20:03:33 CST 2018
     */
    int insert(HotCorp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_corp
     *
     * @mbg.generated Wed Jun 20 20:03:33 CST 2018
     */
    int insertSelective(HotCorp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_corp
     *
     * @mbg.generated Wed Jun 20 20:03:33 CST 2018
     */
    List<HotCorp> selectByExample(HotCorpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_corp
     *
     * @mbg.generated Wed Jun 20 20:03:33 CST 2018
     */
    HotCorp selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_corp
     *
     * @mbg.generated Wed Jun 20 20:03:33 CST 2018
     */
    int updateByExampleSelective(@Param("record") HotCorp record, @Param("example") HotCorpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_corp
     *
     * @mbg.generated Wed Jun 20 20:03:33 CST 2018
     */
    int updateByExample(@Param("record") HotCorp record, @Param("example") HotCorpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_corp
     *
     * @mbg.generated Wed Jun 20 20:03:33 CST 2018
     */
    int updateByPrimaryKeySelective(HotCorp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hot_corp
     *
     * @mbg.generated Wed Jun 20 20:03:33 CST 2018
     */
    int updateByPrimaryKey(HotCorp record);
}