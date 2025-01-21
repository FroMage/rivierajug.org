---
layout: :theme/page
title: "Archives"
author: stephane
---

<dl>
{#for pair in site.archives}
	<dt>{pair.key}</dt>
	<dd>
		<ul>
		{#for post in pair.value}
			<li>{post.info.date.format}: <a href="{post.url}">{post.data.title.extractTopic}</a></li>
		{/for}
		</ul>
	</dd>
{/for}
</dl>