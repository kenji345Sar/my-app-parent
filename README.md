# my-app-parent

Spring Boot を使用したマルチモジュール構成のデモプロジェクトです。  
WSL 上で動作確認済みです。

## 📦 プロジェクト構成

```
my-app-parent/
├── my-app-model/        # 共通モデル（Greetingクラスなど）
├── my-app-web/          # Webアプリケーション（REST API）
├── src/                 # 初期生成されたが未使用
├── pom.xml              # 親プロジェクト（マルチモジュール管理）
```

## 🚀 使用技術

- Java 17
- Spring Boot 3.4.4
- Maven
- WSL（Ubuntu）

## ✅ 機能概要

- `/hello` エンドポイントで JSON レスポンスを返します。
- `Greeting` クラスを共通モデルとして `my-app-model` で管理。
- WebAPI は `my-app-web` モジュールで実装。

## 🔧 実行手順（WSL）

```bash
# 全体ビルド
mvn clean install

# Webアプリ起動
cd my-app-web
mvn spring-boot:run
```

## 🌐 動作確認

ブラウザで以下のURLにアクセス：

```
http://localhost:8080/hello
```

レスポンス例：

```json
{"message":"こんにちは、Spring Boot + マルチモジュール from WSL!"}
```

## 📁 .gitignore の設定

`.gitignore` は [Toptal Gitignore Generator](https://www.toptal.com/developers/gitignore) を使用し、Java + Maven 用に最適化されています。


