
<style>
.top-menu {
	overflow: hidden;
}

.top-menu .menu-item {
	height: 100%;
}

.top-menu .menu-item:hover {
	/* background-color: #a6692b; */
	cursor: pointer;
}

.top-menu .drop-down {
	display: none;
	position: absolute;
	top: 20px;
	z-index: 10000;
	background-color: white;
	box-shadow: 0px 0px 3px rgb(241, 241, 241);
	border: 1px solid #d1d1d1;
}

.top-menu .drop-down ul {
	padding: 0px;
	margin: 0px;
	list-style-type: none;
	min-width: 180px;
}

.top-menu .drop-down ul li {
	
}

.top-menu .drop-down ul li a {
	padding: 5px 15px 5px 15px;
	display: block;
	color: #222;
	text-decoration: none;
}

.top-menu .drop-down ul li a:hover {
	background-color: #a6692b;
	color: white;
	cursor: pointer;
}

#toolbar {
	font-size: 16px;
	padding: 0px 5px 0px 0px;
	color: #000;
	border-left: 1px solid #111;
	margin-left: -1px;
}

#toolbar span {
	text-align: center;
	width: 35px;
	padding: 2px;
	display: inline-block;
	height: 100%;
}

#toolbar span:hover {
	background-color: #ddd;
	color: #a6692b;
	cursor: pointer;
}
</style>
<script>
	$(function(){
		$(".top-menu .menu-item span").click(function(){
			$(this).next().fadeIn("fast");
		});
		$(".top-menu .menu-item").mouseleave(function(){
			$(this).children().last().hide();
		});	
		$(".top-menu .menu-item .drop-down ul li").click(function(){
			$(".top-menu .menu-item .drop-down").hide();
		});
	});
	
</script>

		<!-- <div class='av-row av-row-4'></div> -->
			<div class='container' style="height:30px">
				<div class='row'>
				    <div class='col-xs-3'></div>
					<div class='col-xs-20 av-row' style='background-color:#4aaaa6'>
					  <div class='row'>
					    Best Free Responsive WordPress Themes
					  </div>
                    </div>
					<div class='col-xs-10 av-row' style='background-color:#4aaaa6'>
					  <div class="text-right" style="padding:3px">
						<i class="fa fa-bell"
							style="padding:5px 10px 8px 10px; margin-top:-3px; display:inline-block;"></i>
							Hi ${admin.studentName } <a href='${ctxPath}/Logout' style='color:white'>(Logout)</a> 
					  </div>
					</div>
					<div class='col-xs-3'></div>
				</div>
			</div>
		





