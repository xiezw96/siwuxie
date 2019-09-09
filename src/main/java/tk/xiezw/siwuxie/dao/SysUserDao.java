package tk.xiezw.siwuxie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tk.xiezw.siwuxie.entity.SysUser;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@Repository
public interface SysUserDao extends JpaRepository<SysUser, Long> {
}
