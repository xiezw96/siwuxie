package tk.xiezw.siwuxie.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author xiezw
 * @date 2019/9/10
 */
@Data
@Entity
public class SysUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String salt;

}
