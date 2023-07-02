INSERT INTO todo.members(member_Id, name, mail_address, phone_number)
VALUES
 (1, '布川 光良', 'fukawa_teruyoshi@example.com', '03-1234-5678'),
 (2, '栗山 友以乃', 'kuriyama_yuino@example.com', '03-1234-5678'),
 (3, '藤村 薫', 'fujimura_kaoru@example.com', '03-1234-5678'),
 (4, '伊集院 建', 'ijuuin_ken@example.com', '03-1234-5678'),
 (5, '大和 路子', 'yamato_michiko@example.com', '03-1234-5678'),
 (6, '三宅 有起子', 'miyake_yukiya@example.com', '03-1234-5678')
 ;

 INSERT INTO todo.member_profiles(member_profile_id)
 values
 (1),
 (2),
 (3),
 (4),
 (5),
 (6)
 ;

ALTER SEQUENCE todo.member_Id RESTART WITH 100;
ALTER SEQUENCE todo.member_profile_id RESTART WITH 100;
