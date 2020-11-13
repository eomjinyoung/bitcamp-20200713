-- 학생
DROP TABLE IF EXISTS lms_stud RESTRICT;

-- 강사
DROP TABLE IF EXISTS lms_tchr RESTRICT;

-- 매니저
DROP TABLE IF EXISTS lms_mgr RESTRICT;

-- 교육과정
DROP TABLE IF EXISTS lms_lect RESTRICT;

-- 교실
DROP TABLE IF EXISTS lms_room RESTRICT;

-- 수강신청
DROP TABLE IF EXISTS lms_appl RESTRICT;

-- 사용자
DROP TABLE IF EXISTS lms_user RESTRICT;

-- 학력
DROP TABLE IF EXISTS lms_edu_level RESTRICT;

-- 학교
DROP TABLE IF EXISTS lms_school RESTRICT;

-- 전공
DROP TABLE IF EXISTS lms_major RESTRICT;

-- 지점
DROP TABLE IF EXISTS lms_center RESTRICT;

-- 은행
DROP TABLE IF EXISTS lms_bank RESTRICT;

-- 교육과정강사
DROP TABLE IF EXISTS lms_tchr_lect RESTRICT;

-- 교실사진
DROP TABLE IF EXISTS lms_room_photo RESTRICT;

-- 직급
DROP TABLE IF EXISTS lms_posi RESTRICT;

-- 부서
DROP TABLE IF EXISTS lms_dept RESTRICT;

-- 주소
DROP TABLE IF EXISTS lms_addr RESTRICT;

-- 학생
CREATE TABLE lms_stud (
  sno   INTEGER     NOT NULL COMMENT '학생번호', -- 학생번호
  work  INTEGER     NOT NULL COMMENT '재직여부', -- 재직여부
  elno  INTEGER     NOT NULL COMMENT '학력번호', -- 학력번호
  schno INTEGER     NOT NULL COMMENT '학교번호', -- 학교번호
  majno INTEGER     NOT NULL COMMENT '전공번호', -- 전공번호
  banno INTEGER     NULL     COMMENT '은행번호', -- 은행번호
  acnt  VARCHAR(20) NULL     COMMENT '계좌번호' -- 계좌번호
)
COMMENT '학생';

-- 학생
ALTER TABLE lms_stud
  ADD CONSTRAINT PK_lms_stud -- 학생 기본키
    PRIMARY KEY (
      sno -- 학생번호
    );

-- 강사
CREATE TABLE lms_tchr (
  tno   INTEGER     NOT NULL COMMENT '강사번호', -- 강사번호
  wage  INTEGER     NOT NULL COMMENT '시급', -- 시급
  elno  INTEGER     NOT NULL COMMENT '학력번호', -- 학력번호
  schno INTEGER     NOT NULL COMMENT '학교번호', -- 학교번호
  majno INTEGER     NOT NULL COMMENT '전공번호', -- 전공번호
  banno INTEGER     NULL     COMMENT '은행번호', -- 은행번호
  acnt  VARCHAR(20) NULL     COMMENT '계좌번호' -- 계좌번호
)
COMMENT '강사';

-- 강사
ALTER TABLE lms_tchr
  ADD CONSTRAINT PK_lms_tchr -- 강사 기본키
    PRIMARY KEY (
      tno -- 강사번호
    );

-- 매니저
CREATE TABLE lms_mgr (
  mno INTEGER     NOT NULL COMMENT '매니저번호', -- 매니저번호
  pno INTEGER     NOT NULL COMMENT '직급번호', -- 직급번호
  dno INTEGER     NOT NULL COMMENT '부서번호', -- 부서번호
  fax VARCHAR(30) NULL     COMMENT '팩스' -- 팩스
)
COMMENT '매니저';

-- 매니저
ALTER TABLE lms_mgr
  ADD CONSTRAINT PK_lms_mgr -- 매니저 기본키
    PRIMARY KEY (
      mno -- 매니저번호
    );

-- 교육과정
CREATE TABLE lms_lect (
  lno     INTEGER      NOT NULL COMMENT '교육과정번호', -- 교육과정번호
  title   VARCHAR(255) NOT NULL COMMENT '과정명', -- 과정명
  content MEDIUMTEXT   NOT NULL COMMENT '내용', -- 내용
  sdt     DATE         NOT NULL COMMENT '시작일', -- 시작일
  edt     DATE         NOT NULL COMMENT '종료일', -- 종료일
  hrs     INTEGER      NOT NULL COMMENT '총강의시간', -- 총강의시간
  rno     INTEGER      NULL     COMMENT '교실번호', -- 교실번호
  mno     INTEGER      NULL     COMMENT '매니저번호' -- 매니저번호
)
COMMENT '교육과정';

-- 교육과정
ALTER TABLE lms_lect
  ADD CONSTRAINT PK_lms_lect -- 교육과정 기본키
    PRIMARY KEY (
      lno -- 교육과정번호
    );

ALTER TABLE lms_lect
  MODIFY COLUMN lno INTEGER NOT NULL AUTO_INCREMENT COMMENT '교육과정번호';

-- 교실
CREATE TABLE lms_room (
  rno   INTEGER     NOT NULL COMMENT '교실번호', -- 교실번호
  cenno INTEGER     NOT NULL COMMENT '지점번호', -- 지점번호
  title VARCHAR(70) NOT NULL COMMENT '교실명', -- 교실명
  capa  INTEGER     NOT NULL COMMENT '수용인원' -- 수용인원
)
COMMENT '교실';

-- 교실
ALTER TABLE lms_room
  ADD CONSTRAINT PK_lms_room -- 교실 기본키
    PRIMARY KEY (
      rno -- 교실번호
    );

ALTER TABLE lms_room
  MODIFY COLUMN rno INTEGER NOT NULL AUTO_INCREMENT COMMENT '교실번호';

-- 수강신청
CREATE TABLE lms_appl (
  ano  INTEGER  NOT NULL COMMENT '수강신청번호', -- 수강신청번호
  sno  INTEGER  NOT NULL COMMENT '학생번호', -- 학생번호
  lno  INTEGER  NOT NULL COMMENT '교육과정번호', -- 교육과정번호
  cdt  DATETIME NOT NULL DEFAULT now() COMMENT '신청일', -- 신청일
  stat INTEGER  NULL     DEFAULT 0 COMMENT '상태' -- 상태
)
COMMENT '수강신청';

-- 수강신청
ALTER TABLE lms_appl
  ADD CONSTRAINT PK_lms_appl -- 수강신청 기본키
    PRIMARY KEY (
      ano -- 수강신청번호
    );

-- 수강신청 유니크 인덱스
CREATE UNIQUE INDEX UIX_lms_appl
  ON lms_appl ( -- 수강신청
    sno ASC, -- 학생번호
    lno ASC  -- 교육과정번호
  );

ALTER TABLE lms_appl
  MODIFY COLUMN ano INTEGER NOT NULL AUTO_INCREMENT COMMENT '수강신청번호';

-- 사용자
CREATE TABLE lms_user (
  uno      INTEGER      NOT NULL COMMENT '사용자번호', -- 사용자번호
  name     VARCHAR(70)  NOT NULL COMMENT '이름', -- 이름
  email    VARCHAR(40)  NOT NULL COMMENT '이메일', -- 이메일
  pwd      VARCHAR(120) NOT NULL COMMENT '암호', -- 암호
  jumin    VARCHAR(13)  NOT NULL COMMENT '주민번호', -- 주민번호
  tel      VARCHAR(30)  NOT NULL COMMENT '전화', -- 전화
  ano      INTEGER      NULL     COMMENT '주소번호', -- 주소번호
  det_addr VARCHAR(255) NULL     COMMENT '상세주소', -- 상세주소
  photo    VARCHAR(255) NULL     COMMENT '사진' -- 사진
)
COMMENT '사용자';

-- 사용자
ALTER TABLE lms_user
  ADD CONSTRAINT PK_lms_user -- 사용자 기본키
    PRIMARY KEY (
      uno -- 사용자번호
    );

-- 사용자 유니크 인덱스
CREATE UNIQUE INDEX UIX_lms_user
  ON lms_user ( -- 사용자
    email ASC -- 이메일
  );

-- 사용자 유니크 인덱스2
CREATE UNIQUE INDEX UIX_lms_user2
  ON lms_user ( -- 사용자
    jumin ASC -- 주민번호
  );

-- 사용자 인덱스
CREATE INDEX IX_lms_user
  ON lms_user( -- 사용자
    name ASC -- 이름
  );

ALTER TABLE lms_user
  MODIFY COLUMN uno INTEGER NOT NULL AUTO_INCREMENT COMMENT '사용자번호';

-- 학력
CREATE TABLE lms_edu_level (
  elno  INTEGER     NOT NULL COMMENT '학력번호', -- 학력번호
  title VARCHAR(70) NOT NULL COMMENT '학력명' -- 학력명
)
COMMENT '학력';

-- 학력
ALTER TABLE lms_edu_level
  ADD CONSTRAINT PK_lms_edu_level -- 학력 기본키
    PRIMARY KEY (
      elno -- 학력번호
    );

-- 학력 인덱스
CREATE INDEX IX_lms_edu_level
  ON lms_edu_level( -- 학력
    title ASC -- 학력명
  );

ALTER TABLE lms_edu_level
  MODIFY COLUMN elno INTEGER NOT NULL AUTO_INCREMENT COMMENT '학력번호';

-- 학교
CREATE TABLE lms_school (
  schno INTEGER     NOT NULL COMMENT '학교번호', -- 학교번호
  title VARCHAR(70) NOT NULL COMMENT '학교명' -- 학교명
)
COMMENT '학교';

-- 학교
ALTER TABLE lms_school
  ADD CONSTRAINT PK_lms_school -- 학교 기본키
    PRIMARY KEY (
      schno -- 학교번호
    );

-- 학교 인덱스
CREATE INDEX IX_lms_school
  ON lms_school( -- 학교
    title ASC -- 학교명
  );

ALTER TABLE lms_school
  MODIFY COLUMN schno INTEGER NOT NULL AUTO_INCREMENT COMMENT '학교번호';

-- 전공
CREATE TABLE lms_major (
  majno INTEGER     NOT NULL COMMENT '전공번호', -- 전공번호
  title VARCHAR(70) NOT NULL COMMENT '전공명' -- 전공명
)
COMMENT '전공';

-- 전공
ALTER TABLE lms_major
  ADD CONSTRAINT PK_lms_major -- 전공 기본키
    PRIMARY KEY (
      majno -- 전공번호
    );

-- 전공 인덱스
CREATE INDEX IX_lms_major
  ON lms_major( -- 전공
    title ASC -- 전공명
  );

ALTER TABLE lms_major
  MODIFY COLUMN majno INTEGER NOT NULL AUTO_INCREMENT COMMENT '전공번호';

-- 지점
CREATE TABLE lms_center (
  cenno INTEGER     NOT NULL COMMENT '지점번호', -- 지점번호
  title VARCHAR(70) NOT NULL COMMENT '지점명' -- 지점명
)
COMMENT '지점';

-- 지점
ALTER TABLE lms_center
  ADD CONSTRAINT PK_lms_center -- 지점 기본키
    PRIMARY KEY (
      cenno -- 지점번호
    );

-- 지점 인덱스
CREATE INDEX IX_lms_center
  ON lms_center( -- 지점
    title ASC -- 지점명
  );

ALTER TABLE lms_center
  MODIFY COLUMN cenno INTEGER NOT NULL AUTO_INCREMENT COMMENT '지점번호';

-- 은행
CREATE TABLE lms_bank (
  banno INTEGER     NOT NULL COMMENT '은행번호', -- 은행번호
  title VARCHAR(70) NOT NULL COMMENT '은행명' -- 은행명
)
COMMENT '은행';

-- 은행
ALTER TABLE lms_bank
  ADD CONSTRAINT PK_lms_bank -- 은행 기본키
    PRIMARY KEY (
      banno -- 은행번호
    );

-- 은행 인덱스
CREATE INDEX IX_lms_bank
  ON lms_bank( -- 은행
    title ASC -- 은행명
  );

ALTER TABLE lms_bank
  MODIFY COLUMN banno INTEGER NOT NULL AUTO_INCREMENT COMMENT '은행번호';

-- 교육과정강사
CREATE TABLE lms_tchr_lect (
  lno INTEGER NOT NULL COMMENT '교육과정번호', -- 교육과정번호
  tno INTEGER NOT NULL COMMENT '강사번호' -- 강사번호
)
COMMENT '교육과정강사';

-- 교육과정강사
ALTER TABLE lms_tchr_lect
  ADD CONSTRAINT PK_lms_tchr_lect -- 교육과정강사 기본키
    PRIMARY KEY (
      lno, -- 교육과정번호
      tno  -- 강사번호
    );

-- 교실사진
CREATE TABLE lms_room_photo (
  rpno     INTEGER      NOT NULL COMMENT '교실사진번호', -- 교실사진번호
  filepath VARCHAR(255) NOT NULL COMMENT '사진파일', -- 사진파일
  rno      INTEGER      NOT NULL COMMENT '교실번호' -- 교실번호
)
COMMENT '교실사진';

-- 교실사진
ALTER TABLE lms_room_photo
  ADD CONSTRAINT PK_lms_room_photo -- 교실사진 기본키
    PRIMARY KEY (
      rpno -- 교실사진번호
    );

ALTER TABLE lms_room_photo
  MODIFY COLUMN rpno INTEGER NOT NULL AUTO_INCREMENT COMMENT '교실사진번호';

-- 직급
CREATE TABLE lms_posi (
  pno   INTEGER     NOT NULL COMMENT '직급번호', -- 직급번호
  title VARCHAR(70) NOT NULL COMMENT '직급명' -- 직급명
)
COMMENT '직급';

-- 직급
ALTER TABLE lms_posi
  ADD CONSTRAINT PK_lms_posi -- 직급 기본키
    PRIMARY KEY (
      pno -- 직급번호
    );

-- 직급 인덱스
CREATE INDEX IX_lms_posi
  ON lms_posi( -- 직급
    title ASC -- 직급명
  );

ALTER TABLE lms_posi
  MODIFY COLUMN pno INTEGER NOT NULL AUTO_INCREMENT COMMENT '직급번호';

-- 부서
CREATE TABLE lms_dept (
  dno   INTEGER     NOT NULL COMMENT '부서번호', -- 부서번호
  cenno INTEGER     NOT NULL COMMENT '지점번호', -- 지점번호
  title VARCHAR(70) NOT NULL COMMENT '부서명' -- 부서명
)
COMMENT '부서';

-- 부서
ALTER TABLE lms_dept
  ADD CONSTRAINT PK_lms_dept -- 부서 기본키
    PRIMARY KEY (
      dno -- 부서번호
    );

ALTER TABLE lms_dept
  MODIFY COLUMN dno INTEGER NOT NULL AUTO_INCREMENT COMMENT '부서번호';

-- 주소
CREATE TABLE lms_addr (
  ano      INTEGER      NOT NULL COMMENT '주소번호', -- 주소번호
  pstno    VARCHAR(6)   NOT NULL COMMENT '우편번호', -- 우편번호
  bas_addr VARCHAR(255) NOT NULL COMMENT '기본주소' -- 기본주소
)
COMMENT '주소';

-- 주소
ALTER TABLE lms_addr
  ADD CONSTRAINT PK_lms_addr -- 주소 기본키
    PRIMARY KEY (
      ano -- 주소번호
    );

ALTER TABLE lms_addr
  MODIFY COLUMN ano INTEGER NOT NULL AUTO_INCREMENT COMMENT '주소번호';

-- 학생
ALTER TABLE lms_stud
  ADD CONSTRAINT FK_lms_user_TO_lms_stud -- 사용자 -> 학생
    FOREIGN KEY (
      sno -- 학생번호
    )
    REFERENCES lms_user ( -- 사용자
      uno -- 사용자번호
    );

-- 학생
ALTER TABLE lms_stud
  ADD CONSTRAINT FK_lms_edu_level_TO_lms_stud -- 학력 -> 학생
    FOREIGN KEY (
      elno -- 학력번호
    )
    REFERENCES lms_edu_level ( -- 학력
      elno -- 학력번호
    );

-- 학생
ALTER TABLE lms_stud
  ADD CONSTRAINT FK_lms_school_TO_lms_stud -- 학교 -> 학생
    FOREIGN KEY (
      schno -- 학교번호
    )
    REFERENCES lms_school ( -- 학교
      schno -- 학교번호
    );

-- 학생
ALTER TABLE lms_stud
  ADD CONSTRAINT FK_lms_major_TO_lms_stud -- 전공 -> 학생
    FOREIGN KEY (
      majno -- 전공번호
    )
    REFERENCES lms_major ( -- 전공
      majno -- 전공번호
    );

-- 학생
ALTER TABLE lms_stud
  ADD CONSTRAINT FK_lms_bank_TO_lms_stud -- 은행 -> 학생
    FOREIGN KEY (
      banno -- 은행번호
    )
    REFERENCES lms_bank ( -- 은행
      banno -- 은행번호
    );

-- 강사
ALTER TABLE lms_tchr
  ADD CONSTRAINT FK_lms_user_TO_lms_tchr -- 사용자 -> 강사
    FOREIGN KEY (
      tno -- 강사번호
    )
    REFERENCES lms_user ( -- 사용자
      uno -- 사용자번호
    );

-- 강사
ALTER TABLE lms_tchr
  ADD CONSTRAINT FK_lms_edu_level_TO_lms_tchr -- 학력 -> 강사
    FOREIGN KEY (
      elno -- 학력번호
    )
    REFERENCES lms_edu_level ( -- 학력
      elno -- 학력번호
    );

-- 강사
ALTER TABLE lms_tchr
  ADD CONSTRAINT FK_lms_school_TO_lms_tchr -- 학교 -> 강사
    FOREIGN KEY (
      schno -- 학교번호
    )
    REFERENCES lms_school ( -- 학교
      schno -- 학교번호
    );

-- 강사
ALTER TABLE lms_tchr
  ADD CONSTRAINT FK_lms_major_TO_lms_tchr -- 전공 -> 강사
    FOREIGN KEY (
      majno -- 전공번호
    )
    REFERENCES lms_major ( -- 전공
      majno -- 전공번호
    );

-- 강사
ALTER TABLE lms_tchr
  ADD CONSTRAINT FK_lms_bank_TO_lms_tchr -- 은행 -> 강사
    FOREIGN KEY (
      banno -- 은행번호
    )
    REFERENCES lms_bank ( -- 은행
      banno -- 은행번호
    );

-- 매니저
ALTER TABLE lms_mgr
  ADD CONSTRAINT FK_lms_user_TO_lms_mgr -- 사용자 -> 매니저
    FOREIGN KEY (
      mno -- 매니저번호
    )
    REFERENCES lms_user ( -- 사용자
      uno -- 사용자번호
    );

-- 매니저
ALTER TABLE lms_mgr
  ADD CONSTRAINT FK_lms_posi_TO_lms_mgr -- 직급 -> 매니저
    FOREIGN KEY (
      pno -- 직급번호
    )
    REFERENCES lms_posi ( -- 직급
      pno -- 직급번호
    );

-- 매니저
ALTER TABLE lms_mgr
  ADD CONSTRAINT FK_lms_dept_TO_lms_mgr -- 부서 -> 매니저
    FOREIGN KEY (
      dno -- 부서번호
    )
    REFERENCES lms_dept ( -- 부서
      dno -- 부서번호
    );

-- 교육과정
ALTER TABLE lms_lect
  ADD CONSTRAINT FK_lms_mgr_TO_lms_lect -- 매니저 -> 교육과정
    FOREIGN KEY (
      mno -- 매니저번호
    )
    REFERENCES lms_mgr ( -- 매니저
      mno -- 매니저번호
    );

-- 교육과정
ALTER TABLE lms_lect
  ADD CONSTRAINT FK_lms_room_TO_lms_lect -- 교실 -> 교육과정
    FOREIGN KEY (
      rno -- 교실번호
    )
    REFERENCES lms_room ( -- 교실
      rno -- 교실번호
    );

-- 교실
ALTER TABLE lms_room
  ADD CONSTRAINT FK_lms_center_TO_lms_room -- 지점 -> 교실
    FOREIGN KEY (
      cenno -- 지점번호
    )
    REFERENCES lms_center ( -- 지점
      cenno -- 지점번호
    );

-- 수강신청
ALTER TABLE lms_appl
  ADD CONSTRAINT FK_lms_stud_TO_lms_appl -- 학생 -> 수강신청
    FOREIGN KEY (
      sno -- 학생번호
    )
    REFERENCES lms_stud ( -- 학생
      sno -- 학생번호
    );

-- 수강신청
ALTER TABLE lms_appl
  ADD CONSTRAINT FK_lms_lect_TO_lms_appl -- 교육과정 -> 수강신청
    FOREIGN KEY (
      lno -- 교육과정번호
    )
    REFERENCES lms_lect ( -- 교육과정
      lno -- 교육과정번호
    );

-- 사용자
ALTER TABLE lms_user
  ADD CONSTRAINT FK_lms_addr_TO_lms_user -- 주소 -> 사용자
    FOREIGN KEY (
      ano -- 주소번호
    )
    REFERENCES lms_addr ( -- 주소
      ano -- 주소번호
    );

-- 교육과정강사
ALTER TABLE lms_tchr_lect
  ADD CONSTRAINT FK_lms_lect_TO_lms_tchr_lect -- 교육과정 -> 교육과정강사
    FOREIGN KEY (
      lno -- 교육과정번호
    )
    REFERENCES lms_lect ( -- 교육과정
      lno -- 교육과정번호
    );

-- 교육과정강사
ALTER TABLE lms_tchr_lect
  ADD CONSTRAINT FK_lms_tchr_TO_lms_tchr_lect -- 강사 -> 교육과정강사
    FOREIGN KEY (
      tno -- 강사번호
    )
    REFERENCES lms_tchr ( -- 강사
      tno -- 강사번호
    );

-- 교실사진
ALTER TABLE lms_room_photo
  ADD CONSTRAINT FK_lms_room_TO_lms_room_photo -- 교실 -> 교실사진
    FOREIGN KEY (
      rno -- 교실번호
    )
    REFERENCES lms_room ( -- 교실
      rno -- 교실번호
    );

-- 부서
ALTER TABLE lms_dept
  ADD CONSTRAINT FK_lms_center_TO_lms_dept -- 지점 -> 부서
    FOREIGN KEY (
      cenno -- 지점번호
    )
    REFERENCES lms_center ( -- 지점
      cenno -- 지점번호
    );