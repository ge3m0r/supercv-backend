> 本项目是程序员内功修炼体系课之【项目实战营】的其中一个项目，将于2025年1月29日前完结！
>
> 内功修炼体系课网站：[codecrush.cn](https://www.codecrush.cn)

> 本项目会与2025年1月29日前完结，因为大家都是利用业余时间参与，所以，进度可能不会像我一个人去做那么快，也不会像公司里做项目那么快，请知晓！


项目实战营是我们内功修炼体系课中的其中一个训练营，在这个训练营中，我会持续带大家一块做一些有价值的项目。第一个项目是：超能简历，用AI大模型来优化简历。

## 项目背景
大模型可以说是当前最火的方向，没有之一。我之前也提到过，大模型是一个既有技术壁垒，又有业务壁垒的方向。大模型算法研究是一个有技术壁垒的方向，大模型应用开发是一个有业务壁垒的方向。对于什么是技术壁垒、什么是业务壁垒，我在《程序员职场生存指南》中有详细介绍，限于篇幅，这里就不再赘述。

多数人并不适合做大模型算法研究，毕竟这个方向的门槛很高，你需要名校硕士甚至博士，在顶会发过论文等等。但是，大模型应用开发是我们每个人都可以去尝试的，并且是很多人抵抗35岁中年危机的有效方法。毕竟这领域是新兴领域，所有人都是零起点，而且市场需求也很大，很多公司都在尝试大模型方面的产品，绝大部分公司也期望自己的产品集成大模型应用。

退一步讲，即便我们不去做大模型算法研究，不去开发大模型应用，但是，多去了解一些新兴领域的知识，多去尝试，对自己来说，也是给未来增加更多可能。我一直说，不要总是用上再学，用上再学，可能就已经晚了，机会就有优先给了有准备的其他人了。

当然，做大模型项目，也多少夹杂着我的一点私心。我个人是对新鲜事物特别感兴趣的，但是，由于忙于写课，无暇去探索，正好，我们内功修炼体系课需要交付项目实战营这样一个课程，两者结合起来，做一个大模型相关的应用开发，既让我了解了大模型相关知识，又交付了课程，一举两得！

## 选题逻辑
为什么选择做超能简历助手这个项目呢？有三点原因。
- 第一点，鉴于这是项目实战营的第一个项目，并且我们采用了新的开发模式（这个下文详细讲），我们希望项目尽可能聚焦，不要过于庞大，AI优化简历这个项目符合这个需求，并且，项目非常完整，可以说是，麻雀虽小五脏俱全，能够达到我们课程交付的目的（这个下文详细讲）。
- 第二点，我们希望做一个能上线的产品，而不只是一个玩具，因为玩具的需求都是假的，你塞再多技术进去，也都不会有成就感，获得感也没有真实的产品强。
- 第三点，我们不仅希望产品能上线，还希望真正的能运营，能积累用户，因此，它必须是能解决用户的某个痛点。除此之外，我还希望这个产品对学员有帮助，跟我现在做的事情相关。

综合这几点，我们选择了超能简历助手这样一个项目。

## 项目特色
学架构最重要的是学习架构的演进过程，代码、产品、项目等也都是。我们的实战营交付的不仅仅是代码和文档或视频，也会交付整个演进过程，甚至是我的学习过程。

除此之外，在实战营中，你不仅仅只是去看，还可以真刀真枪的参与进来。项目中的架构设计、技术解决方案、技术选型、代码实现、Code Review等等，你都可以参与进来，同时，你的所有以上产出，我都会Review，并提出意见，帮助你完善、优化、精进。

学做事方法，比单纯学某个技术更重要！技术迁移到其他项目可能就不适用了，但学做事不会。我们的项目不仅仅教你技术，更重要的是整个项目的开发过程中涉及到的其他方方面面，比如Code Review、单元测试、架构设计理念等等。因此，做什么项目，对我们来说也并没有那么重要！

最后，很多人跟我反馈过，自己做的项目都是CRUD，纯业务开发，没有高大上的技术，问我怎么办？实际上，多数情况是，自己没有发现技术优化点。超能简历看似也是一个CRUD的项目，但是，我们融入了很多技术在里面，比如Nacos配置中心、Redis缓存、RocketMQ消息队列解耦、幂等、分布式锁、秒杀、订单、各种设计模式等等。

你来看我们项目是怎么使用这些技术的，怎么把一个看似CRUD的项目做到有技术含量的，你照着学，也可以把学到的搬移到自己的项目中。

## 协作方式
我们会将项目分割成一个一个小的任务，不仅限于编码工作，还包括一些架构设计、技术解决方案等，甚至Code Review、产品设计、UI设计都可以作为一个任务，交由学员负责，我只需要指导和把控质量即可。

为了方便项目管理，我们在本网站上开发了一个简单的Jira功能：[任务列表](https://www.codecrush.cn/practice/8228/task ) 。你对那个任务感兴趣，你就可以认领哪个任务，并在规定的时间内完成。

我们的开发遵循大厂（Google）的开发流程，所有的代码必须严格遵循代码规范，并需要编写完善的单元测试，以及Code Review，并且，复杂的代码必须配备文档。

## 适合学员
前端我们采用vue，后端我们采用Java来开发。有些同学说，我不熟悉Java和Vue怎么办呢？

- 一方面，你可以借这个项目学一下Java和Vue，技多不压身嘛，我也建议，后端的同学尝试一下前端开发，前端的同学尝试一下后端开发。
- 另一方面，编程实现只是到技术开发的最后一个环节，实际上，前面的架构设计、解决方案等等才是最重要的，你不贡献代码，完全可以贡献其他东西。
- 还有，如果你熟悉的是Golang、Python、PHP等，你完全可以参照设计，重新实现成自己熟悉的语言，全部的代码都自己写，这样收获更多。

**更新：侧重后端，前端暂时不开源，因为本身我是后端出身，对前端并不是特别熟悉，没有能力指导前端开发，也怕前端代码写不好误导了大家，因此，前端闭源！**

## 技术收获
从项目实战营中，你将获得以下收获：
- 学会从0到1完整开发一个网站项目（侧重后端）
- 掌握大厂开发流程，如单元测试、CR等
- 学习如何把看似CRUD的业务系统做的有技术含量
- 提高架构和系统设计能力，提高编写优质代码能力，并迁移到工作中
- 熟悉大模型相关的应用开发，为入行大模型应用开发的做履历积累
- 将项目写到简历中，为简历加分
- 亲身体会争哥的学习方法和做事方法


## 常见问题

Q：不就是写Prompt提示词嘛，会不会太简单了？
A：前面讲到，我们开发的项目是要上线给用户使用的，核心的东西可能就写Prompt提示词，但是能够做到用户觉得好用，优化质量高，这个很难。这就好比，搜索引擎核心的东西也就那么点，但要做到搜索质量很高，可能要上千人来做。

Q：做大模型应用开发，是不是学不到大模型的技术？
A：实际上，这就好比你做其他业务系统一样，Kafka、Redis这些东西也都是应用，但是，你要想用好它还是或多或少的了解一些原理性的东西。大模型也是如此。
我们的项目更多的是提供给你一些场景，至于你研究的深不深入，还是看你自己。这跟你平时做其他项目是一样的，同样的项目，有的人只是crud，还抱怨项目没技术含量，有的人却学到了很多东西。

Q：AI优化简历这个项目是不是太简单了？
A：前面也提到，这个项目麻雀虽小，五脏俱全。除了核心的AI优化功能，其他辅助功能也需要开发。比如，支付、账号权限管理、安全性、评分系统、搜索等等。

Q：类似的产品很多，对这个项目不感兴趣怎么办？
A：确实，类似的产品确实很多，但我们主要还是学技术哈。至于盈利，不要过度追求，一般越是追求越是得不到，正所谓所谓无心插柳柳成荫。我们首要目标是把产品做好。
实际上，项目做什么不重要，重要的是这个过程。就跟你上学一样，学什么并不重要，反正以后也用不上，学的过程很重要！

Q：需要报名参与吗？需要额外付费吗？
A：不需要额外付费，也不需要报名才能参与，直接认领任务即可。
