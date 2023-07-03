INSERT INTO
  example.members(id, full_name, mail_address, phone_number)
VALUES
  (
    1,
    '布川 光良',
    'fukawa_teruyoshi@example.com',
    '03-1234-5678'
  ),
  (
    2,
    '栗山 友以乃',
    'kuriyama_yuino@example.com',
    '03-1234-5678'
  ),
  (
    3,
    '藤村 薫',
    'fujimura_kaoru@example.com',
    '03-1234-5678'
  ),
  (
    4,
    '伊集院 建',
    'ijuuin_ken@example.com',
    '03-1234-5678'
  ),
  (
    5,
    '大和 路子',
    'yamato_michiko@example.com',
    '03-1234-5678'
  ),
  (
    6,
    '三宅 有起子',
    'miyake_yukiya@example.com',
    '03-1234-5678'
  );

INSERT INTO
  example.member_settings(member_id, theme, autologin)
values
  (1, 'dark', true),
  (2, 'dark', false),
  (3, 'light', true),
  (4, 'light', true),
  (5, 'dark', false),
  (6, 'light', true);

ALTER SEQUENCE example.member_Id RESTART WITH 100;
