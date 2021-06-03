CREATE
    TABLE
        orders(
            order_id VARCHAR(60) NOT NULL COMMENT '訂單編號',
            customer_name VARCHAR(20) NOT NULL COMMENT '客戶姓名',
            total_amount INT NOT NULL COMMENT '訂單金額',
            version INT NOT NULL COMMENT '版本鎖',
            created_by VARCHAR(60) NOT NULL,
            created_date datetime NOT NULL,
            last_modified_by VARCHAR(60) NOT NULL,
            last_modified_date datetime NOT NULL,
            PRIMARY KEY(order_id)
        ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '訂單資料';

CREATE
    TABLE
        orders_detail(
            ser_id VARCHAR(60) NOT NULL COMMENT '流水號',
            order_id VARCHAR(60) NOT NULL COMMENT '訂單編號',
            goods_id VARCHAR(60) NOT NULL COMMENT '商品編號',
            goods_name VARCHAR(60) NOT NULL COMMENT '商品名稱',
            count INT NOT NULL COMMENT '數量',
            version INT NOT NULL COMMENT '版本鎖',
            created_by VARCHAR(60) NOT NULL,
            created_date datetime NOT NULL,
            last_modified_by VARCHAR(60) NOT NULL,
            last_modified_date datetime NOT NULL,
            PRIMARY KEY(ser_id)
        ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '商品資料';

ALTER TABLE
    orders_detail ADD FOREIGN KEY(order_id) REFERENCES orders(order_id);