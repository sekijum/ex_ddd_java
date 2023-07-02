package example.application.repository;

import example.domain.model.member.*;

/**
 * メンバーリポジトリ
 */
public interface MemberRepository {
    Member choose(MemberNumber memberNumber);
}
