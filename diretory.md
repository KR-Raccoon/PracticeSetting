my-java-project/
├── src/
│   ├── main/
│   │   ├── java/                      # Java 소스 코드 디렉토리
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── app/
│   │   │               ├── MainApplication.java
│   │   │               └── config/
│   │   │                   ├── ConfigLoader.java   # RoomBook을 통한 설정 로드
│   │   │                   └── LoggingConfig.java  # 로그 설정 관리
│   │   ├── resources/               # 리소스 디렉토리
│   │       ├── config/              # 환경별 설정 파일
│   │       │   ├── local/           # 로컬 환경 설정
│   │       │   │   └── application.properties
│   │       │   ├── dev/             # 개발 환경 설정
│   │       │   │   └── application.properties
│   │       │   └── prod/            # 리얼 환경 설정
│   │       │       └── application.properties
│   │       ├── logback/             # Logback 설정 파일
│   │       │   └── logback-spring.xml
│   │       └── logs/                # 로그 파일 저장 디렉토리
│   └── test/                        # 테스트 코드 디렉토리
└── build.gradle                     # Gradle 빌드 파일
