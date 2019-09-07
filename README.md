
Running Jenkins in Docker:
```
docker build -t jenkins/validator .
docker run -u 0 -d --name='jenkins' -p 8080:8080 -p 50000:50000 -v `pwd`/jenkins_home:/var/jenkins_home jenkins/validator
```

```
docker run -u 0 -d --name='jenkins' -p 8080:8080 -p 50000:50000 -v `pwd`/jenkins_home:/var/jenkins_home jenkins/jenkins:lts
```

```
docker start jenkins
docker stop jenkins
```




#CONFIG

Jenkins plugins:

Exported at http://localhost:8080/script with:
```
Jenkins.instance.pluginManager.plugins.each{
  plugin -> 
    println ("${plugin.getDisplayName()} (${plugin.getShortName()}): ${plugin.getVersion()}")
}
```

```
JavaScript GUI Lib: Moment.js bundle plugin (momentjs): 1.1.1
Pipeline: Stage View Plugin (pipeline-stage-view): 2.12
OWASP Markup Formatter Plugin (antisamy-markup-formatter): 1.5
Folders Plugin (cloudbees-folder): 6.9
LDAP Plugin (ldap): 1.20
Matrix Project Plugin (matrix-project): 1.14
Pipeline Graph Analysis Plugin (pipeline-graph-analysis): 1.10
Pipeline: Nodes and Processes (workflow-durable-task-step): 2.33
Pipeline: REST API Plugin (pipeline-rest-api): 2.12
Jackson 2 API Plugin (jackson2-api): 2.9.9.1
Credentials Binding Plugin (credentials-binding): 1.20
JavaScript GUI Lib: ACE Editor bundle plugin (ace-editor): 1.1
Resource Disposer Plugin (resource-disposer): 0.13
Authentication Tokens API Plugin (authentication-tokens): 1.3
Workspace Cleanup Plugin (ws-cleanup): 0.37
GitHub Branch Source Plugin (github-branch-source): 2.5.6
GitHub API Plugin (github-api): 1.95
Pipeline: Multibranch (workflow-multibranch): 2.21
Timestamper (timestamper): 1.10
Build Timeout (build-timeout): 1.19
Pipeline: Stage Tags Metadata (pipeline-stage-tags-metadata): 1.3.9
Script Security Plugin (script-security): 1.62
Pipeline: GitHub Groovy Libraries (pipeline-github-lib): 1.0
Git plugin (git): 3.12.0
Subversion Plug-in (subversion): 2.12.2
Pipeline: Groovy (workflow-cps): 2.73
MapDB API Plugin (mapdb-api): 1.0.9.0
Configuration as Code Plugin (configuration-as-code): 1.27
Docker Commons Plugin (docker-commons): 1.15
Pipeline: Stage Step (pipeline-stage-step): 2.3
Pipeline: Declarative (pipeline-model-definition): 1.3.9
Pipeline: Basic Steps (workflow-basic-steps): 2.18
Pipeline: Build Step (pipeline-build-step): 2.9
bouncycastle API Plugin (bouncycastle-api): 2.17
Structs Plugin (structs): 1.20
Pipeline: SCM Step (workflow-scm-step): 2.9
Pipeline: Step API (workflow-step-api): 2.20
GitHub plugin (github): 1.29.4
Pipeline: Shared Groovy Libraries (workflow-cps-global-lib): 2.15
Credentials Plugin (credentials): 2.2.1
Ant Plugin (ant): 1.9
Display URL API (display-url-api): 2.3.2
Mailer Plugin (mailer): 1.24
JSch dependency plugin (jsch): 0.1.55.1
Durable Task Plugin (durable-task): 1.30
Pipeline: Declarative Extension Points API (pipeline-model-extensions): 1.3.9
Apache HttpComponents Client 4.x API Plugin (apache-httpcomponents-client-4-api): 4.5.5-3.0
Pipeline: Supporting APIs (workflow-support): 3.3
Pipeline: Declarative Agent API (pipeline-model-declarative-agent): 1.1.1
Command Agent Launcher Plugin (command-launcher): 1.3
Token Macro Plugin (token-macro): 2.8
GIT server Plugin (git-server): 1.8
Pipeline (workflow-aggregator): 2.6
PAM Authentication plugin (pam-auth): 1.5.1
JavaScript GUI Lib: jQuery bundles (jQuery and jQuery UI) plugin (jquery-detached): 1.2.1
SSH Credentials Plugin (ssh-credentials): 1.17.1
Git client plugin (git-client): 2.8.0
Pipeline: API (workflow-api): 2.36
SSH Slaves plugin (ssh-slaves): 1.30.1
JavaScript GUI Lib: Handlebars bundle plugin (handlebars): 1.1.1
Plain Credentials Plugin (plain-credentials): 1.5
Pipeline: Milestone Step (pipeline-milestone-step): 1.3.1
Oracle Java SE Development Kit Installer Plugin (jdk-tool): 1.3
Docker Pipeline (docker-workflow): 1.19
Gradle Plugin (gradle): 1.33
Pipeline: Model API (pipeline-model-api): 1.3.9
Lockable Resources plugin (lockable-resources): 2.5
Branch API Plugin (branch-api): 2.5.4
Email Extension Plugin (email-ext): 2.66
Pipeline: Job (workflow-job): 2.33
HTML Publisher plugin (htmlpublisher): 1.18
SCM API Plugin (scm-api): 2.6.3
JUnit Plugin (junit): 1.28
Pipeline: Input Step (pipeline-input-step): 2.10
Matrix Authorization Strategy Plugin (matrix-auth): 2.4.2
Result: [Plugin:momentjs, Plugin:pipeline-stage-view, Plugin:antisamy-markup-formatter, Plugin:cloudbees-folder, Plugin:ldap, Plugin:matrix-project, Plugin:pipeline-graph-analysis, Plugin:workflow-durable-task-step, Plugin:pipeline-rest-api, Plugin:jackson2-api, Plugin:credentials-binding, Plugin:ace-editor, Plugin:resource-disposer, Plugin:authentication-tokens, Plugin:ws-cleanup, Plugin:github-branch-source, Plugin:github-api, Plugin:workflow-multibranch, Plugin:timestamper, Plugin:build-timeout, Plugin:pipeline-stage-tags-metadata, Plugin:script-security, Plugin:pipeline-github-lib, Plugin:git, Plugin:subversion, Plugin:workflow-cps, Plugin:mapdb-api, Plugin:configuration-as-code, Plugin:docker-commons, Plugin:pipeline-stage-step, Plugin:pipeline-model-definition, Plugin:workflow-basic-steps, Plugin:pipeline-build-step, Plugin:bouncycastle-api, Plugin:structs, Plugin:workflow-scm-step, Plugin:workflow-step-api, Plugin:github, Plugin:workflow-cps-global-lib, Plugin:credentials, Plugin:ant, Plugin:display-url-api, Plugin:mailer, Plugin:jsch, Plugin:durable-task, Plugin:pipeline-model-extensions, Plugin:apache-httpcomponents-client-4-api, Plugin:workflow-support, Plugin:pipeline-model-declarative-agent, Plugin:command-launcher, Plugin:token-macro, Plugin:git-server, Plugin:workflow-aggregator, Plugin:pam-auth, Plugin:jquery-detached, Plugin:ssh-credentials, Plugin:git-client, Plugin:workflow-api, Plugin:ssh-slaves, Plugin:handlebars, Plugin:plain-credentials, Plugin:pipeline-milestone-step, Plugin:jdk-tool, Plugin:docker-workflow, Plugin:gradle, Plugin:pipeline-model-api, Plugin:lockable-resources, Plugin:branch-api, Plugin:email-ext, Plugin:workflow-job, Plugin:htmlpublisher, Plugin:scm-api, Plugin:junit, Plugin:pipeline-input-step, Plugin:matrix-auth]
```