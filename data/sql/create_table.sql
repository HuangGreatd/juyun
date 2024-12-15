create
    database ju_picture;

use ju_picture;
create table if not exists user
(
    id            bigint auto_increment comment 'id' primary key,
    userAccount   varchar(256)                           not null comment '账号',
    userPassword  varchar(512)                           not null comment '密码',
    unionId       varchar(256)                           null comment '微信开放平台id',
    mpOpenId      varchar(256)                           null comment '公众号openId',
    userName      varchar(256)                           null comment '用户昵称',
    userAvatar    varchar(1024)                          null comment '用户头像',
    userProfile   varchar(512)                           null comment '用户简介',
    userRole      varchar(256) default 'user'            not null comment '用户角色：user/admin/ban/vip',
    createTime    datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    updateTime    datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    vipExpireTime datetime                               null comment '会员过期时间',
    vipCode       varchar(128)                           null comment '会员兑换码',
    vipNumber     bigint                                 null comment '会员编号',
    shareCode     varchar(20)  DEFAULT NULL COMMENT '分享码',
    inviteUser    bigint       DEFAULT NULL COMMENT '邀请用户 id',
    isDelete      tinyint      default 0                 not null comment '是否删除',
    UNIQUE KEY uk_userAccount (userAccount),
    INDEX idx_userName (userName),
    index idx_unionId (unionId)
) comment '用户' collate = utf8mb4_unicode_ci;