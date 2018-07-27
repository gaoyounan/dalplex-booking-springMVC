/*
 * Written by Yi Ren
 */

package com.dorabmon.dao.court;

import com.dorabmon.dao.BaseDao;
import com.dorabmon.model.Court;
import com.dorabmon.model.User;

import java.sql.SQLException;
import java.util.List;

public interface CourtDao extends BaseDao<Court> {

    List<Court> listCourtsByCourtType(String court_type) throws SQLException;
    List<Court> FindCourtIdListByStudentId(int userid) throws SQLException;
}
