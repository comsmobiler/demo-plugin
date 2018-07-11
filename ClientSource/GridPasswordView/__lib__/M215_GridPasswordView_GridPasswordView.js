import React, { Component } from 'react';
import BaseComponent from '../BaseComponent';

import {
	requireNativeComponent,
	ColorPropType,
	View,
	ViewPropTypes
} from 'react-native';

import PropTypes from 'prop-types';

export default class _GridPasswordView_ extends BaseComponent
{
	state: {
		style:Object;
	};

	constructor(props)
	{
		super(props);

		this.state = this.props
	}

	onChange = (event) => {
		this.dispatchEvent('onChange', event.nativeEvent);
	};

	render() {
		let newState = this.getNewState();

		if(!newState) return null;

		const {
			style={},
			...other
		} = newState;
		
		let newStyle = {...this.props.style, ...style};
    newStyle = this.changeErrorWidthPosition(newStyle);  

		return (
			<RCTGridPasswordView
				style={newStyle}
				onChange={this.onChange}
				ref={this.getBaseRef('M215_GridPasswordView_GridPasswordView')}
				{...other}
				>
				{this.props.children}
				{this.children}
			</RCTGridPasswordView>
		);
	}
}

_GridPasswordView_.propTypes = {
	onChange: PropTypes.func,
	...ViewPropTypes,
	PasswordType: PropTypes.string,
	PasswordVisibility:  PropTypes.bool,

};

const RCTGridPasswordView = requireNativeComponent('M215_GridPasswordView_GridPasswordView', _GridPasswordView_,  {
	nativeOnly: {
		onChange: true
	}
});