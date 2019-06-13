jQuery(document).ready(function($) {
	$('.list-group').paginathing({
		perPage: 10,
		containerClass: 'panel',
		prevText: '上一页', // Previous button text
		nextText: '下一页', // Next button text
		firstText: '首页', // "First button" text
		lastText: '末页',// "Last button" text
		activeClass: 'panel_active',
		disabledClass: 'panel_disable'
	})
});
