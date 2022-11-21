---
home: true
tagline: Fabric by Example
actionText: 开始使用
actions:
  - text: 快速上手
    link: /start/
    type: primary
features:
  - title: 简单易学
    details: 手把手教学Fabric
  - title: 代码详细
    details: 注释详尽，示例中的代码全部开源
  - title: 视频讲解
    details: 所有教程B站均有视频
---

# Website

This website is built using [Docusaurus 2](https://docusaurus.io/), a modern static website generator.

### Installation

```
$ yarn
```

### Local Development

```
$ yarn start
```

This command starts a local development server and opens up a browser window. Most changes are reflected live without having to restart the server.

### Build

```
$ yarn build
```

This command generates static content into the `build` directory and can be served using any static contents hosting service.

### Deployment

Using SSH:

```
$ USE_SSH=true yarn deploy
```

Not using SSH:

```
$ GIT_USER=<Your GitHub username> yarn deploy
```

If you are using GitHub pages for hosting, this command is a convenient way to build the website and push to the `gh-pages` branch.
